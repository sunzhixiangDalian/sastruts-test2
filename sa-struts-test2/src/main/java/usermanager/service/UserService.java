package usermanager.service;

import java.util.List;
import javax.annotation.Generated;

import org.apache.commons.lang3.StringUtils;
import org.seasar.extension.jdbc.where.SimpleWhere;
import usermanager.entity.User;

/**
 * {@link User}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2013-8-7 12:22:52")
public class UserService extends AbstractService<User> {

    /**
     * 識別子の昇順ですべてのエンティティを検索します。getCount() が返す値は問い合わせ結果の行数であり、
     * 同等の問い合わせを行った場合に getResultList() が返すエンティティの数と一致するとは限りません。 
     * from() で指定したエンティティに 1対多関連 を 結合 した場合、 
     * getCount() が返す行数は getResultList() が返すエンティティの数よりも多くなる場合があります。
     * @param 
     *            
     * @return long
     */
    public long getCount() {
        return jdbcManager.from(User.class).getCount();
    }

    /**
     * 
     * @param 　int itemStart,int showMaxCount
     * @return エンティティのリスト
     */
    public List<User> findAllOrderById(int itemStart,int showMaxCount) {
        return 
        jdbcManager
        .from(User.class)
        .orderBy("UId")
        .limit(showMaxCount)
        .offset(itemStart)
        .getResultList();
    }
    
    public List<User> searchUser(int itemStart,int showMaxCount,String name,int sex,int age,String addr){
        SimpleWhere where = new SimpleWhere();
        if(StringUtils.isNotEmpty(name)){
            where.contains("UName", name);
        }
        if(sex != -1){
            where.eq("USex",sex);
        }
        if(age != -1){
            where.eq("UAge", age);            
        }
        if(StringUtils.isNotEmpty(addr)){
            where.contains("UAddr", addr);
        }        
        
        List<User> results = 
                jdbcManager.from(User.class)
                .orderBy("UId").limit(showMaxCount).offset(itemStart)
                .where(where).getResultList();
        return  results;
          
    }
    
    public List<User> searchUserByName(String name) {
        List<User> results = 
                jdbcManager.from(User.class)
                .where("UName like ?",name)
                .getResultList();
          return  results;
    } 
    
    
  /*
   * 引数はエンテaィティで、戻り値は、更新した行数です。
   * 挿入するときに、識別子を自動設定することができます。
   * 詳しくは、 識別子定義 を参照してください。
     一意制約違反によりエンティティ挿入ができなかった場合は、
      javax.persistence.EntityExistsException が発生します。
      
   */
    public void addUserTx(String name,int age,int sex,String address) throws Exception {
        User user = new User();
        user.UName = name;
        user.UAge = age;
        user.USex = sex;
        user.UAddr = address;
        jdbcManager.insert(user).execute();
    }
    
    public void updateUserTx(int id,String name,int age,int sex,String address) throws Exception {
        User user = jdbcManager.from(User.class)
                  .where("UId= ?", id)
                  .getSingleResult();
        user.UName = name;
        user.UAge = age;
        user.USex = sex;
        user.UAddr = address;
        jdbcManager.update(user).execute();
    }
    
    public void deleteTx(int id){
        User user = new User();
        user.UId = id;
        jdbcManager
            .delete(user)
            .execute();
    }

   
    
}