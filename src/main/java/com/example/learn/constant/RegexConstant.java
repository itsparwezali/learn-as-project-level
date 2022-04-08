package com.example.learn.constant;

public class RegexConstant {


    public static final String ALPHABETS_ONLY = "^[a-zA-Z ]*$";
    public static final String NUMBERS_ONLY = "^[0-9]*$";
    public static final String ALPHA_NUMERIC = "^[a-zA-Z0-9 ]*$";
    public static final String ALPHA_NUMERIC_WITH_HYPHEN = "^[a-zA-Z0-9-]*$";
    public static final String PERCENTAGE = "^(?=.*[1-9])([0-9]{1,2})([\\.][0-9]{1,2})?$";
    public static final String TRIM_LEADING_ZEROS = "^0+(?!$)";
    public static final String IP_ONLY = "^(http|https):\\/\\/(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]):[0-9]{1,6}(\\/|([\\/](([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])){1,}(\\/)?)*)$";
    public static final String DOMAIN_NAME_ONLY = "^(http|https):\\/\\/(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])(\\/|([\\/](([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])){1,}(\\/)?)*)$";
    public static final String MOBILE_NUMBER = "^[9][6-8][0-9][0-9]{7}$";
    public static final String PERCENTAGE_INCLUSIVE_0 = "^(([0-9]{1,2}[.]([0-9]{1,2}))|([0-9]{1,2}))$";// except 100
    public static final String PERCENTAGE_EXCLUSIVE_0 = "^(?=.*[1-9])([0-9]{1,2})([\\.][0-9]{1,2})?$";  // except 0 and 100
    public static final String PERCENTAGE_INCLUSIVE_0_AND_100 = RegexConstant.PERCENTAGE_INCLUSIVE_0 + "|" + "^(?:100(?:\\.00?)?|\\d?\\d(?:\\.\\d\\d?)?)$";
    public static final String PERCENTAGE_INCLUSIVE_0_AND_1000 = "^(([0-9]{1,3}[.]([0-9]{1,2}))|([0-9]{1,3}))$" + "|" + "^(?:1000(?:\\.00?)?|\\d?\\d(?:\\.\\d\\d?)?)$";
    public static final String AMOUNT_INCLUSIVE_0_AND_999999999 = "^(([0-9]{1,9}[.]([0-9]{1,2}))|([0-9]{1,9}))$" + "|" + "^(?:999999999(?:\\.00?)?|\\d?\\d(?:\\.\\d\\d?)?)$";
    public static final String NO_SPACE_ALLOWED = "^\\S*$";
}
