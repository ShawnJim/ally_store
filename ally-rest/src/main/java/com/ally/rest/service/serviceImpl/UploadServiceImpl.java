package com.ally.rest.service.serviceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ally.rest.po.UploadResult;
import com.ally.rest.service.UploadService;

@Service
public class UploadServiceImpl implements UploadService {
	//ftp服务器信息
	public static final String SERVER_IP = "139.199.210.223";  
	public static final int PORT = 21;  
	public static final String USERNAME = "ftpuser";  
	public static final String PASSWORD = "ally123.";
	public static final String UPLOAD_PATH = "images/";
	@Override
	public UploadResult uploadPic(List<MultipartFile> uploadfile) throws Exception {
		// TODO Auto-generated method stub
		UploadResult result = new UploadResult(); 
		//判断上传文件是否存在
		if (!uploadfile.isEmpty() && uploadfile.size() > 0) {
			//循环输出上传的文件
			for (MultipartFile file : uploadfile) { 
				//获取上传文件的原始名称
				String oringinalFilename = file.getOriginalFilename();
				//获取源文件名后缀
				String prefixName = FilenameUtils.getExtension(oringinalFilename);

				int fileSize = 3145728;
				//图片限制在500k以内
				if(file.getSize() > fileSize) {
					result.setCode("0");
					return result;
				} else if(prefixName.equalsIgnoreCase("jpg")
						|| prefixName.equalsIgnoreCase("png")
						|| prefixName.equalsIgnoreCase("jpeg")
						|| prefixName.equalsIgnoreCase("pneg")) {
					FTPClient ftp = new FTPClient();
					try {
						int reply;
						ftp.connect(SERVER_IP,PORT);// 连接FTP服务器
						//如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器
						ftp.login(USERNAME, PASSWORD);// 登录
						reply = ftp.getReplyCode();
						if (!FTPReply.isPositiveCompletion(reply)) {
							ftp.disconnect();
						}
						ftp.enterLocalPassiveMode();
						if (!ftp.changeWorkingDirectory(UPLOAD_PATH)) {
							ftp.makeDirectory(UPLOAD_PATH);//创建目录
							ftp.changeWorkingDirectory(UPLOAD_PATH);//跳转目录(可根据项目需求选择创建目录的多少)
						}
						/*if (!ftp.changeWorkingDirectory(id)) {
							ftp.makeDirectory(id);
							ftp.changeWorkingDirectory(id);
						}*/
						ftp.setFileType(FTP.BINARY_FILE_TYPE);
						//使用UUID重新命名
						String newFilename = UUID.randomUUID().toString() + "."+prefixName;
						InputStream input = file.getInputStream();
						ftp.storeFile(newFilename, input);
						result.setCode("200");
						result.setPath("ftp://"+USERNAME+":"+PASSWORD+"@139.199.210.223/images/"+newFilename);
						input.close();
						ftp.logout();
					} catch (IOException e) {
						e.printStackTrace();
						result.setCode("1");
						return result;
					} finally {
						if (ftp.isConnected()) {
							try {
								ftp.disconnect();
							} catch (IOException ioe) {
								ioe.printStackTrace();
							}
						}
					}
					/*//设置上传文件的保存地址目录
					String dirPath = "http://39.108.113.97:21/";
					String dirPath = "d:/";
					System.out.println("dirpath==" + dirPath);
					File filePath = new File(dirPath);
					//如果文件地址不存在 则创建目录
					if (!filePath.exists()) {
						filePath.mkdirs();
					}
					//使用时间格式重新命名
					String newFilename = UUID.randomUUID().toString() + "."+prefixName;
					System.out.println(newFilename);
					try {
						//使用MultipartFilr接口的方法完成文件上传到指定位置
						file.transferTo(new File(dirPath + newFilename));
						String filepath = dirPath + newFilename;
						result.setCode("200");
						result.setPath(filepath);
					} catch (IOException e) {
						result.setCode("1");
						return result;
					}*/
				} else {
					System.out.println("上传图片格式不正确");
					result.setCode("3");
					return result;
				}
			}
			//上传成功
			return result;
		} else {
			result.setCode("404");
			return result;
		}
	}

	/**
	 * 图片上传
	 * @param
	 * @param uploadfile
	 * @param request
	 * @return
	 */
	/* @RequestMapping("/fileUpload")
    @ResponseBody
    public UploadResult handleFormUpload(@RequestParam("uploadfile") List<MultipartFile> uploadfile,
                                   HttpServletRequest request) {
        UploadResult result = new UploadResult();
        //判断上传文件是否存在
        if (!uploadfile.isEmpty() && uploadfile.size() > 0) {
            //循环输出上传的文件
            for (MultipartFile file : uploadfile) {
                //获取上传文件的原始名称
                String oringinalFilename = file.getOriginalFilename();
                //获取源文件名后缀
                String prefixName = FilenameUtils.getExtension(oringinalFilename);

                int fileSize = 500000;
                //图片限制在500k以内
                if(file.getSize() > fileSize) {
                    result.setCode("0");
                    return result;
                } else if(prefixName.equalsIgnoreCase("jpg")
                        || prefixName.equalsIgnoreCase("png")
                        || prefixName.equalsIgnoreCase("jpeg")
                        || prefixName.equalsIgnoreCase("pneg")) {
                    //设置上传文件的保存地址目录
                    String dirPath = "http://39.108.113.97:21/";
                    //区分windows和linux的\ 和 /
                    //String dirPath = "E:"+System.getProperty("file.separator")+"uploadfile" + System.getProperty("file.separator");
                    //String dirPath = System.getProperty("file.separator") + "usr" + System.getProperty("file.separator") + "local"
                           // + System.getProperty("file.separator")+"imgbak"+System.getProperty("file.separator");
                    System.out.println("dirpath==" + dirPath);
                    File filePath = new File(dirPath);
                    //如果文件地址不存在 则创建目录
                    if (!filePath.exists()) {
                        filePath.mkdirs();
                    }
                    //使用时间格式重新命名
                    String newFilename = UUID.randomUUID().toString() + "."+prefixName;
                    System.out.println(newFilename);
                    try {
                        //使用MultipartFilr接口的方法完成文件上传到指定位置
                        file.transferTo(new File(dirPath + newFilename));
                        String filepath = dirPath + newFilename;
                        result.setCode("200");
                        result.setPath(filepath);
                    } catch (IOException e) {
                        result.setCode("1");
                        return result;
                    }
                } else {
                    System.out.println("上传图片格式不正确");
                    result.setCode("3");
                    return result;
                }
            }
            //上传成功
            return result;
        } else {
            result.setCode("404");
            return result;
        }
    }*/
}
