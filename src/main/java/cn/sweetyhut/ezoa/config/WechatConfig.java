package cn.sweetyhut.ezoa.config;


public interface WechatConfig {
    String APP_ID = "wxfa38d911d091518d";
    String SECRET_KEY = "26fcab5269df6f4c2112bf1ca54832b6";
    String GRANT_TYPE = "authorization_code";
    String WX_CODE2SESSION_HTTP = "https://api.weixin.qq.com/sns/jscode2session";
}