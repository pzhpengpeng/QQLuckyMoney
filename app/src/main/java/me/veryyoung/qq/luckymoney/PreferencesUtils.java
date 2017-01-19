package me.veryyoung.qq.luckymoney;


import de.robv.android.xposed.XSharedPreferences;

public class PreferencesUtils {

    private static XSharedPreferences instance = null;

    private static XSharedPreferences getInstance() {
        if (instance == null) {
            instance = new XSharedPreferences(PreferencesUtils.class.getPackage().getName());
            instance.makeWorldReadable();
        } else {
            instance.reload();
        }
        return instance;
    }

    public static boolean open() {
        return getInstance().getBoolean("open", false);
    }

    public static boolean password() {
        return getInstance().getBoolean("password", false);
    }

    public static boolean sendPassword() {
        return getInstance().getBoolean("send_password", false);
    }

    public static boolean delay() {
        return getInstance().getBoolean("delay", false);
    }


    public static int delayTime() {
        return getInstance().getInt("delay_time", 0);
    }
}


