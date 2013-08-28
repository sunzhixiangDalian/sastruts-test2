package usermanager.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Userエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2013-8-7 12:22:46")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /** UIdプロパティ
     * 自動生成のタイプは、 @GeneratedValue の strategy 要素で指定します。指定できるタイプのは次の4つです。
        
        GenerationType.TABLE
        テーブルを使います。
        GenerationType.SEQUENCE
        シーケンスを使います。
        GenerationType.IDENTITY
        データベース固有の識別子自動生成を使います。
        GenerationType.AUTO (デフォルト)
        データベースに応じて TABLE・SEQUENCE・IDENTITY のいずれかが選択されます。
         IDENTITY が使える場合は IDENTITY に、 IDENTITY が使えなくて SEQUENCE が使える
         場合は SEQUENCE に、IDENTITY も SEQUENCE も使えない場合は TABLE になります。
     *  
     *  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer UId;
    
    /** UNameプロパティ */
    @Column(length = 30, nullable = false, unique = false)
    public String UName;

    /** UAgeプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer UAge;

    /** USexプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer USex;

    /** UAddrプロパティ */
    @Column(length = 100, nullable = false, unique = false)
    public String UAddr;

    public Integer getUId() {
        return UId;
    }

    public void setUId(Integer uId) {
        UId = uId;
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String uName) {
        UName = uName;
    }

    public Integer getUAge() {
        return UAge;
    }

    public void setUAge(Integer uAge) {
        UAge = uAge;
    }

    public Integer getUSex() {
        return USex;
    }

    public void setUSex(Integer uSex) {
        USex = uSex;
    }

    public String getUAddr() {
        return UAddr;
    }

    public void setUAddr(String uAddr) {
        UAddr = uAddr;
    }

    
}