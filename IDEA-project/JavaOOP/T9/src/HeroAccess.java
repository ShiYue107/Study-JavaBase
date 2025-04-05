import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HeroAccess {
    static JDBCConn jdbc=new JDBCConn();

    //添加英雄
    public boolean addHero() {
        //连接数据库
        Connection conn=jdbc.getConn();
        //书写SQL语句
        String sql="insert into t_hero value(1,'100112','嬴政',560,550,570,'法师')";
        //管理SQL语句
        PreparedStatement pstsmt=null;
        try {
            pstsmt=jdbc.getConn().prepareStatement(sql);
            int index=pstsmt.executeUpdate();
            return index>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            jdbc.close(null,pstsmt,conn);
        }
        return false;
    }

    //修改英雄
    public boolean upDateHero() {
        //连接数据库
        Connection conn=jdbc.getConn();
        //书写SQL语句
        String sql="update t_hero set attckPower=550 where id=6";
        //管理SQL语句
        PreparedStatement pstsmt=null;
        try {
            pstsmt=jdbc.getConn().prepareStatement(sql);
            int index=pstsmt.executeUpdate();
            return index>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            jdbc.close(null,pstsmt,conn);
        }
        return false;
    }

    //修改英雄
    public boolean deleHero() {
        //连接数据库
        Connection conn=jdbc.getConn();
        //书写SQL语句
        String sql="delete from t_hero where id=8";
        //管理SQL语句
        PreparedStatement pstsmt=null;
        try {
            pstsmt=jdbc.getConn().prepareStatement(sql);
            int index=pstsmt.executeUpdate();
            return index>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            jdbc.close(null,pstsmt,conn);
        }
        return false;
    }

    //查询英雄信息
    public List<Hero> queryHero(){
        //连接数据库
        Connection conn=null;
        ResultSet res=null;
        //管理SQL
        PreparedStatement pstsmt=null;
        List<Hero> list =new ArrayList();
        try {
            conn=jdbc.getConn();
            String sql = "select * from t_hero";
            pstsmt=conn.prepareStatement(sql);
            res=pstsmt.executeQuery();
            while (res.next()){
                Hero ho=new Hero();
                ho.setNum(res.getString("num"));
                ho.setName(res.getString("name"));
                ho.setOutput(res.getInt("output"));
                ho.setAttackPower(res.getInt("attckPower"));
                ho.setMagicValue(res.getInt("magicValue"));
                ho.setType(res.getString("type"));
                list.add(ho);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    //测试
    public static void main(String[] args) {
        HeroAccess ha = new HeroAccess();
        /*boolean flag1 = ha.addHero();
        System.out.println("添加英雄："+flag1);
        boolean flag2 = ha.upDateHero();
        System.out.println("添加英雄："+flag2);
        boolean flag3 = ha.deleHero();
        System.out.println("添加英雄："+flag3);*/
        List<Hero> list = ha.queryHero();
        for (int i = 0; i <list.size() ; i++) {
            Hero ho=list.get(i);
            System.out.println((i + 1) +"-"+ ho.getNum() + "---"
                    + ho.getName() + "---" + ho.getOutput()
                    + "---" + ho.getAttackPower() + "---"
                    + ho.getMagicValue() + "---" + ho.getType());
        }
    }
}
