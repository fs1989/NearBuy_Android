package hk.nearbuy.nearbuy;
import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;


public class EcmobileManager {

	private static RegisterApp registerApp;

	private static Context mContext;

	// 获取友盟key
	public static String getUmengKey(Context context)
    {
        return "5347e9d656240b720f01983a";
	}
	
	// 获取快递key
	public static String getKuaidiKey(Context context) {
        return "xxx";
	}
	
	// 获取科大讯飞key
	public static String getXunFeiCode(Context context)
    {
        return "xxx";
	}
	
	// 获取百度push的key
	public static String getPushKey(Context context)
    {
        return "xxx";
	}
	
	// 获取百度push的seckey
	public static String getPushSecKey(Context context)
    {
        return "xxx";
	}
	
	// 获取支付宝parterID(合作者身份)
	public static String getAlipayParterId(Context context)
    {
        return "";//2088302063277912";
	}
	
	// 获取支付宝sellerID(收款账户)
	public static String getAlipaySellerId(Context context)
    {
        return "";//zhangdan0525@outlook.com";
	}
	
	// 获取支付宝key
	public static String getAlipayKey(Context context)
    {
        return "";//pz4u5nxsxplhq8i84sftwg6ide2iexnd";
	}
	
	// 获取支付宝rsa_alipay_public(公钥)
	public static String getRsaAlipayPublic(Context context)
    {
        return "";//MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC/ygHdNmT9zs5aRE+EArtW4HaWmWbtIlvN3VwGUzvrxDbj1YZlpHfHigygyVXWAJrx0srN25rtQnz2iFmzLAyZNwXlLrOAfY4tzWAGAZ5VaNgAlFv95cAMh5S2v3LB2oAxmsF7r+vpDm+V7wM0US4xfxreeEAOWZGBF0a";
	}
	
	// 获取支付宝rsa_private(私钥)
	public static String getRsaPrivate(Context context)
    {
        return "";//MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";
	}
	
	// 获取支付宝回调地址
	public static String getAlipayCallback(Context context)
    {
        return ""; //http://115.28.107.78/ecmobile/payment/alipay/sdk/notify_url.php
	}
	
	// 获取新浪key
	public static String getSinaKey(Context context)
    {
        return "xxx";
	}
	
	// 获取新浪secret
	public static String getSinaSecret(Context context)
    {
        return "xxx";
	}
	
	// 获取新浪的回调地址
    public static String getSinaCallback(Context context)
    {
        return "xxx";
    }
	
	// 获取微信id
	public static String getWeixinAppId(Context context)
    {
        return "xxx";
	}
	
	// 获取微信key
	public static String getWeixinAppKey(Context context)
    {
        return "xxx";
	}
	
	// 获取腾讯key
	public static String getTencentKey(Context context)
    {
        return "xxx";
	}
	
	// 获取腾讯secret
	public static String getTencentSecret(Context context)
    {
        return "xxx";
	}
	
	// 获取腾讯callback
	public static String getTencentCallback(Context context)
    {
        return "xxx";
	}
	
	public static void registerApp(RegisterApp register) {
		registerApp = register;
	}
	
	public static interface RegisterApp {
		public void onRegisterResponse(boolean success);
	}
	
	// 保存push_token
	public static void setBaiduUUID(Context context, String uuid, String appId, String appKey) {

	}
	
}
