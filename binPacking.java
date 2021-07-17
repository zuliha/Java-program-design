import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.*;
import javax.swing.JFrame;

public class binPacking {
    public static void main(String[]args) {
        LinkedList<rec> items = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int recNum = sc.nextInt();
        //大矩形宽，高
        double bh = sc.nextDouble();
        double bw = sc.nextDouble();
        for(int i = 0;i<recNum;i++) {
            rec r =new rec();
            r.h = sc.nextDouble();
            r.w = sc.nextDouble();
            r.flag = 0;
            items.add(r);
        }
        Collections.sort (items, new recComparator()); // 排序
        double tem_h=bh,tem_w=0;
        double current_h = 0;
        boolean flag_h = false;
        for(int i = 0;i<items.size();i++) {
            rec rectangle = new rec();
            tem_w+=items.get(i).w;
            if(tem_w<=bw && tem_h>=0) {
                
                if(!flag_h) {
                    current_h = items.get(i).h;
                    flag_h = true;
                }
                rectangle.h= items.get(i).h;
                rectangle.w = items.get(i).w;
                rectangle.ltx = tem_w - items.get(i).w;
                rectangle.lty = tem_h -  items.get(i).h;
                rectangle.flag = 1;
                items.set(i, rectangle);
            }else if(tem_w> bw && tem_h>=0) {
                tem_h = tem_h-current_h;
                tem_w=0;
                i-=1;
                flag_h = false;
            }else if(tem_h<0) {
                rectangle.flag = 0;
                items.set(i, rectangle);
                break;
            }
        }
        new ShapesPanel(items,bh,bw);
    }
}

class rec{
    double w,h;
    double ltx,lty;
    int flag;
    public rec() {}
    public rec(double h,double w,int flag,double ltx,double lty) {
        this.ltx = ltx;
        this.lty = lty;
        this.h = h;
        this.w = w;
        this.flag = flag;
    }
}
 class recComparator implements Comparator<rec> {
      @Override
      public int compare(rec o1, rec o2 ) {
           return (int) (o2 . h -o1. h ); ///
      }
}
 class ShapesPanel extends JFrame{
        LinkedList<rec> items;
        double bh,bw;
        private Graphics g;
        ShapesPanel(LinkedList<rec> items,double bh,double bw){
             this.bh = bh;
             this.bw = bw;
             this.items = items;
             setBackground(Color.white);
             Container p = getContentPane();
             setBounds(100, 200, 1000, 1000);
             setVisible(true);
             p.setBackground(Color.WHITE);
             setLayout(null);
             setResizable(false);
             this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
             g =  this.getGraphics();
             paintComponent(g);
        } 
         public static String randomHexStr(int len) {
                try {
                    StringBuffer result = new StringBuffer();
                    for(int i=0;i<len;i++) {
                        result.append(Integer.toHexString(new Random().nextInt(16)));
                    }
                    return result.toString().toUpperCase();
                } catch (Exception e) {
                    System.out.println("获取16进制字符串异常，返回默认...");
                    return "00CCCC";
                }
            }
         
        public static Color randomColor() {
            int color = Integer.valueOf(randomHexStr(6), 16);
            return new Color(color);
        }
         public void paintComponent(Graphics g){
             try {
                    g.setColor(randomColor());
                    g.fillRect(0, 0, (int)bh, (int)bw); //此方法不适用宽高double
                    for(int i = 0;i<items.size();i++) {
                        if(items.get(i).flag == 1) {
                            g.setColor(randomColor());
                            g.fillRect((int)items.get(i).ltx,(int)items.get(i).lty, (int)items.get(i).w, (int)items.get(i).h);
                        }
                    }
             } catch (Exception e) {
                 e.printStackTrace();
             }
         }
    }
