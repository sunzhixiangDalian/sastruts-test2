package usermanager.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Employee}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "Aug 27, 2013 10:50:04 AM")
public class EmployeeNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * jobTypeのプロパティ名を返します。
     * 
     * @return jobTypeのプロパティ名
     */
    public static PropertyName<String> jobType() {
        return new PropertyName<String>("jobType");
    }

    /**
     * salaryのプロパティ名を返します。
     * 
     * @return salaryのプロパティ名
     */
    public static PropertyName<Integer> salary() {
        return new PropertyName<Integer>("salary");
    }

    /**
     * departmentIdのプロパティ名を返します。
     * 
     * @return departmentIdのプロパティ名
     */
    public static PropertyName<Integer> departmentId() {
        return new PropertyName<Integer>("departmentId");
    }

    /**
     * addressIdのプロパティ名を返します。
     * 
     * @return addressIdのプロパティ名
     */
    public static PropertyName<Integer> addressId() {
        return new PropertyName<Integer>("addressId");
    }

    /**
     * versionのプロパティ名を返します。
     * 
     * @return versionのプロパティ名
     */
    public static PropertyName<Integer> version() {
        return new PropertyName<Integer>("version");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _EmployeeNames extends PropertyName<Employee> {

        /**
         * インスタンスを構築します。
         */
        public _EmployeeNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _EmployeeNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _EmployeeNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * jobTypeのプロパティ名を返します。
         *
         * @return jobTypeのプロパティ名
         */
        public PropertyName<String> jobType() {
            return new PropertyName<String>(this, "jobType");
        }

        /**
         * salaryのプロパティ名を返します。
         *
         * @return salaryのプロパティ名
         */
        public PropertyName<Integer> salary() {
            return new PropertyName<Integer>(this, "salary");
        }

        /**
         * departmentIdのプロパティ名を返します。
         *
         * @return departmentIdのプロパティ名
         */
        public PropertyName<Integer> departmentId() {
            return new PropertyName<Integer>(this, "departmentId");
        }

        /**
         * addressIdのプロパティ名を返します。
         *
         * @return addressIdのプロパティ名
         */
        public PropertyName<Integer> addressId() {
            return new PropertyName<Integer>(this, "addressId");
        }

        /**
         * versionのプロパティ名を返します。
         *
         * @return versionのプロパティ名
         */
        public PropertyName<Integer> version() {
            return new PropertyName<Integer>(this, "version");
        }
    }
}