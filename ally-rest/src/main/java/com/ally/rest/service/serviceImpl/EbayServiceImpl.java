package com.ally.rest.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.ally.rest.service.EbayService;

@Service
public class EbayServiceImpl implements EbayService {

/*	public static final String TOKEN = "AgAAAA**AQAAAA**aAAAAA**yDnoWg**nY+sHZ2PrBmdj6wVnY+sEZ2PrA2dj6wFk4GnCZmFoQSdj6x9nY+seQ"
			+ "**iokEAA**AAMAAA**fYMQGuQu/OQHYOWHSDZMV1+eBeqdczOwyl1piksL5yY8pHXIjBIhvi/jINrkwz8Z3oYifMpDkCPQN3vZr35Tm1"
			+ "HoJfQJcvhtaCGbB+Au0IWEB4J8b0w6DXCi7v1AvWsKJyue2IT+QSX6A9fjnHgC1jqe+Xg8GrXoMlUTCkB790EfTC4p8gNce5gYKNycGt"
			+ "ccnnBNzx7ROGDMCIt+9QeOkPBo0EfWNLOB/4FOZvpOVTVuN64HXmRsV1BFrjZBFxAWDrWGr+87RiwirP5XlXV4/RlXEZkcPsVimliWgx"
			+ "FcVAE+iTO7FdeBhNQenE63B+8rR4eWyzt3rUfNiD2Hhnemp7eKvfdWvn+x8Pf9CuxV35lk9B9WkUwBETiEADIOTkq2ayVagMSD3TuQD6"
			+ "uEVd+2MDvbBGLYxwiwgxLW5QJbZ0ue8CvCGwKBULVDCKPEThZIIMg2UVl/VaPgIoNEFMWP9Toc3wsrs3UaImgNwmnXYX4Zpgvx0NXtAE"
			+ "LA29auzsEjbgzcp9q8uKV/BZYqHbOIXBdibpnx6pgf5S9xydfSgh648kcpRqRxixuZG8kqgjfnRqAVQurIHMtjuhy/ZI9qhzb28KUmnx"
			+ "0sLbyRSVVjHDGi0mW68t52zihJ9qBz5poVoXSjtcMRMIJaCd831sYMlw5939fPsHHpaumhGCseGvoLdvRvQEkVtvWnuXXqzLO8e2i0Tx"
			+ "VvFIQ1NfPZT+tBkQftHSmXHbWH/3HACI7p+DPrRE31Xx9UCyjtAYA2sH5T";

	public static final String SERVICE_URL = "https://api.sandbox.ebay.com/wsapi";

	// sample category ids supporting custom item specifics
	private static Set<String> sampleCatIDSet = new HashSet<String>();
	static {
		sampleCatIDSet.add("162140");
	}
*/
	/**
	 * Populate eBay SDK ApiContext object with data input from user
	 * @return ApiContext object
	 */
	/*private static ApiContext getApiContext() throws IOException {

		String input;
		ApiContext apiContext = new ApiContext();

		//set Api Token to access eBay Api Server
		ApiCredential cred = apiContext.getApiCredential();
		input = TOKEN;
		cred.seteBayToken(input);
		//set Api Server Url
		input = SERVICE_URL;
		apiContext.setApiServerUrl(input);

		return apiContext;
	}*/

	/**
	 * Build a sample item
	 * @return ItemType object
	 */
	/*private static ItemType buildItem() throws IOException {

		String input;
		ItemType item = new ItemType();

		// item title
		item.setTitle(ConsoleUtil.readString("Title: "));
		// item description
		item.setDescription(ConsoleUtil.readString("Description: "));

		// listing type
		item.setListingType(ListingTypeCodeType.FIXED_PRICE_ITEM);
		// listing price
		item.setCurrency(CurrencyCodeType.USD);
		input = ConsoleUtil.readString("Start Price: ");
		AmountType amount = new AmountType();
		amount.setValue(Double.valueOf(input));
		item.setStartPrice(amount);

		// listing duration
		item.setListingDuration(ListingDurationCodeType.DAYS_3.value());

		// item location and country
		item.setLocation(ConsoleUtil.readString("Location: "));
		item.setCountry(CountryCodeType.US);

		// listing category
		CategoryType cat = new CategoryType();
		String catID = "162967";
		cat.setCategoryID(catID);
		item.setPrimaryCategory(cat);

		// item quantity
		item.setQuantity(new Integer(1));

		// item condition, New
		// item.setConditionID(1000);  

		// item specifics
		if(sampleCatIDSet.contains(catID)) {
			item.setItemSpecifics(buildItemSpecifics());
		}
		//		* The Business Policies API and related Trading API fields are
		//		* available in sandbox. It will be available in production for a
		//		* limited number of sellers with Version 775. 100 percent of sellers
		//		* will be ramped up to use Business Polcies in July 2012


		//Create Seller Profile container
		SellerProfilesType sellerProfile=new SellerProfilesType();

		//Set Payment ProfileId
		input = ConsoleUtil.readString("Enter your Seller Policy Payment ProfileId : ");
		SellerPaymentProfileType sellerPaymentProfile=new SellerPaymentProfileType();
		sellerPaymentProfile.setPaymentProfileID(Long.valueOf(input));
		sellerProfile.setSellerPaymentProfile(sellerPaymentProfile);

		//Set Shipping ProfileId
		SellerShippingProfileType sellerShippingProfile=new SellerShippingProfileType();
		input = ConsoleUtil.readString("Enter your Seller Policy Shipping ProfileId : ");
		sellerShippingProfile.setShippingProfileID(Long.valueOf(input));
		sellerProfile.setSellerShippingProfile(sellerShippingProfile);

		//Set Return Policy ProfileId
		SellerReturnProfileType sellerReturnProfile=new SellerReturnProfileType();
		input = ConsoleUtil.readString("Enter your Seller Policy Return ProfileId : ");
		sellerReturnProfile.setReturnProfileID(Long.valueOf(input));
		sellerProfile.setSellerReturnProfile(sellerReturnProfile);

		//Add Seller Profile to Item
		item.setSellerProfiles(sellerProfile);
		return item;
	}*/

	// build sample item specifics
	/*public static NameValueListArrayType buildItemSpecifics(){

		//create the content of item specifics
		NameValueListArrayType nvArray = new NameValueListArrayType();
		NameValueListType nv1 = new NameValueListType();
		nv1.setName("Origin");
		nv1.setValue(new String[]{"US"});
		NameValueListType nv2 = new NameValueListType();
		nv2.setName("Year");
		nv2.setValue(new String[]{"2010"});
		nvArray.setNameValueList(new NameValueListType[]{nv1,nv2});

		return nvArray;
	}*/
}
