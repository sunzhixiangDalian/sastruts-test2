package usermanager.entity;

import javax.annotation.Generated;
import usermanager.entity.AddressNames._AddressNames;
import usermanager.entity.DepartmentNames._DepartmentNames;
import usermanager.entity.EmployeeNames._EmployeeNames;
import usermanager.entity.UserNames._UserNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "Aug 27, 2013 10:50:04 AM")
public class Names {

    /**
     * {@link Address}の名前クラスを返します。
     * 
     * @return Addressの名前クラス
     */
    public static _AddressNames address() {
        return new _AddressNames();
    }

    /**
     * {@link Department}の名前クラスを返します。
     * 
     * @return Departmentの名前クラス
     */
    public static _DepartmentNames department() {
        return new _DepartmentNames();
    }

    /**
     * {@link Employee}の名前クラスを返します。
     * 
     * @return Employeeの名前クラス
     */
    public static _EmployeeNames employee() {
        return new _EmployeeNames();
    }

    /**
     * {@link User}の名前クラスを返します。
     * 
     * @return Userの名前クラス
     */
    public static _UserNames user() {
        return new _UserNames();
    }
}