import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarTest extends JFrame{
    //创建菜单栏
    JMenuBar jmb = new JMenuBar();
    //初始化
    public void init() {
        //设置布局方式
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //创建一级菜单
        JMenu jmf=new JMenu("文件(F)");
        //创建二级菜单
        JMenuItem jmf_n=new JMenuItem("新建(N)");
        JMenuItem jmf_o=new JMenuItem("打开(O)");
        JMenuItem jmf_s=new JMenuItem("保存(S)");
        JMenuItem jmf_x=new JMenuItem("退出(X)");
        JMenu jme=new JMenu("编辑(E)");
        JMenuItem jme_u=new JMenuItem("撤销(U)");
        JMenuItem jme_t=new JMenuItem("剪切(T)");
        JMenuItem jme_c=new JMenuItem("复制(C)");
        JMenuItem jme_p=new JMenuItem("粘贴(P)");
        JMenu jmo=new JMenu("格式(O)");
        JMenuItem jmo_1=new JMenuItem("撤销(U)");
        JMenuItem jmo_2=new JMenuItem("剪切(T)");
        JMenu jmv=new JMenu("查看(V)");
        JMenuItem jmv_1=new JMenuItem("撤销(U)");
        JMenu jmh=new JMenu("帮助(H)");
        JMenuItem jmh_1=new JMenuItem("撤销(U)");
        JMenuItem jmh_2=new JMenuItem("剪切(T)");
        //将二级菜单添加到一级菜单中
        jmf.add(jmf_n);
        jmf.add(jmf_o);
        jmf.add(jmf_s);
        jmf.add(jmf_x);
        jme.add(jme_u);
        jme.add(jme_t);
        jme.add(jme_c);
        jme.add(jme_p);
        jmo.add(jmo_1);
        jmo.add(jmo_2);
        jmv.add(jmv_1);
        jmh.add(jmh_1);
        jmh.add(jmh_2);
        //将一级菜单添加到菜单栏中
        jmb.add(jmf);
        jmb.add(jme);
        jmb.add(jmo);
        jmb.add(jmv);
        jmb.add(jmh);
        //将菜单添加到JFrame中
        this.setJMenuBar(jmb);
        //设置标题
        this.setTitle("Tom自用记事本");
        //设置宽高
        this.setSize(1000,800);
        //设置默认关闭
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体可见
        this.setVisible(true);
        //设置居中显示
        this.setLocationRelativeTo(null);
        //设置不可调整大小
        this.setResizable(false);
    }
    public static void main(String[] args) {
        new JMenuBarTest().init();
        System.out.println("这个");
    }
}

