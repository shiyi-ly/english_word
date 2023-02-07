package com.english.word.common.utils.validate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2019-04-03 11:11
 */
public class Regex {

    //清除掉所有特殊字符
    public final static String SYNTAX_REG="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";

    // 清除掉所有特殊字符
    public final static String SYNTAX_REG_VEHICLE ="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。,？]";
    //全部是数字
    public final static String NUMBER_ONLY = "^[0-9]*$ ";
    //正整数
    public final static String UNSIGNED_INT = "^[1-9][0-9]\\d*$";
    //中文字符
    public final static String CHINESE = "^[\u4e00-\u9fa5]{0,}$";
    //大小写字母、数字、下划线
    public final static String CODE = "^[A-Za-z0-9_]+$";
    //仅英文字母
    public final static String ONLY_EN = "^[A-Za-z]+$";
    //中文、字母、数字、下划线
    public final static String CN_EN_NUM = "^[\u4E00-\u9FA5A-Za-z0-9_]+$";
    //电子邮件
    public final static String EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    //域名
    public final static String DOMAIN = "[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(/.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+/.?";
    //URL
    public final static String URL = "^http://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$";
    //国内手机号码
    public final static String MOBILE = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
    //国内座机
    public final static String TELEPHONE = "((\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$)";
    //国内身份证号码
    public final static String CARD_NO = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";
    //双字节
    public final static String DOUBLE_BYTE = "[^\\x00-\\xff]";
    //邮政编码
    public final static String POST_CODE = "^[1-9]\\d{5}(?!\\d)$";
    //IP地址
    public final static String IP_ADDRESS = "((?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d))";
    //护照
    public final static String PASSPORT = "/^1[45][0-9]{7}$|(^[P|p|S|s]\\d{7}$)|(^[S|s|G|g|E|e]\\d{8}$)|(^[Gg|Tt|Ss|Ll|Qq|Dd|Aa|Ff]\\d{8}$)|(^[H|h|M|m]\\d{8,10}$)/";
    //普通车牌
    public final static String LICENSE_PLATE_NUMBER = "^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1}$";
    //新能源车牌
    public final static String LICENSE_PLATE_NUMBER_NEW_ENERGY = "^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}(([0-9]{5}[DF])|([DF][A-HJ-NP-Z0-9][0-9]{4}))$";

    //vin验证
    public static boolean checkVIN(String vin) {
        Map<Integer, Integer> vinMapWeighting = null;
        Map<Character, Integer> vinMapValue = null;
        vinMapWeighting = new HashMap<Integer, Integer>();
        vinMapValue = new HashMap<Character, Integer>();
        vinMapWeighting.put(1, 8);
        vinMapWeighting.put(2, 7);
        vinMapWeighting.put(3, 6);
        vinMapWeighting.put(4, 5);
        vinMapWeighting.put(5, 4);
        vinMapWeighting.put(6, 3);
        vinMapWeighting.put(7, 2);
        vinMapWeighting.put(8, 10);
        vinMapWeighting.put(9, 0);
        vinMapWeighting.put(10, 9);
        vinMapWeighting.put(11, 8);
        vinMapWeighting.put(12, 7);
        vinMapWeighting.put(13, 6);
        vinMapWeighting.put(14, 5);
        vinMapWeighting.put(15, 4);
        vinMapWeighting.put(16, 3);
        vinMapWeighting.put(17, 2);
        vinMapValue.put('0', 0);
        vinMapValue.put('1', 1);
        vinMapValue.put('2', 2);
        vinMapValue.put('3', 3);
        vinMapValue.put('4', 4);
        vinMapValue.put('5', 5);
        vinMapValue.put('6', 6);
        vinMapValue.put('7', 7);
        vinMapValue.put('8', 8);
        vinMapValue.put('9', 9);
        vinMapValue.put('A', 1);
        vinMapValue.put('B', 2);
        vinMapValue.put('C', 3);
        vinMapValue.put('D', 4);
        vinMapValue.put('E', 5);
        vinMapValue.put('F', 6);
        vinMapValue.put('G', 7);
        vinMapValue.put('H', 8);
        vinMapValue.put('J', 1);
        vinMapValue.put('K', 2);
        vinMapValue.put('M', 4);
        vinMapValue.put('L', 3);
        vinMapValue.put('N', 5);
        vinMapValue.put('P', 7);
        vinMapValue.put('R', 9);
        vinMapValue.put('S', 2);
        vinMapValue.put('T', 3);
        vinMapValue.put('U', 4);
        vinMapValue.put('V', 5);
        vinMapValue.put('W', 6);
        vinMapValue.put('X', 7);
        vinMapValue.put('Y', 8);
        vinMapValue.put('Z', 9);
        boolean reultFlag = false;
        try {
            String uppervin = vin.toUpperCase();
            //排除字母O、I
            if (vin == null || uppervin.indexOf("O") >= 0 || uppervin.indexOf("I") >= 0) {
                reultFlag = false;
            } else {
                //1:长度为17
                if (vin.length() == 17) {
                    char[] vinArr = uppervin.toCharArray();
                    int amount = 0;
                    for (int i = 0; i < vinArr.length; i++) {
                        //VIN码从从第一位开始，码数字的对应值×该位的加权值，计算全部17位的乘积值相加
                        amount += vinMapValue.get(vinArr[i]) * vinMapWeighting.get(i + 1);
                    }
                    //乘积值相加除以11、若余数为10，即为字母Ｘ
                    if (amount % 11 == 10) {
                        if (vinArr[8] == 'X') {
                            reultFlag = true;
                        } else {
                            reultFlag = false;
                        }

                    } else {
                        //VIN码从从第一位开始，码数字的对应值×该位的加权值，
                        //计算全部17位的乘积值相加除以11，所得的余数，即为第九位校验值
                        if (amount % 11 != vinMapValue.get(vinArr[8])) {
                            reultFlag = false;
                        } else {
                            reultFlag = true;
                        }
                    }
                }
                //1:长度不为17
                if (!vin.equals("") && vin.length() != 17) {
                    reultFlag = false;
                }
            }
        } catch (Throwable e) {
        }
        return reultFlag;
    }
}
