public class numberOf_i {
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "wangxiaoer";
        names[1] = "lixiaosan";
        names[2] = "zhangxiaosi";
        names[3] = "wangxiaowu";
        names[4] = "guoxiaoliu";
        names[5] = "sunxiaoqi";
        names[6] = "yangxiaoba";
        names[7] = "cuixiaojiu";
        names[8] = "chenxiaoshi";
        names[9] = "zhaoxiaoshiyi";

        int n = 0;
        // 统计该数组中的姓名中包含i的个数
        for (String name : names) {
            n += count(name, "i");
        }
        System.out.println("该数组中i的个数为:" + n);
    }

    public static int count(String s, String substr) {
        int n = 0;
        for (int i = s.indexOf(substr); i >= 0; i = s.indexOf(substr, i + 1))
            n++;
        return n;
    }
}

