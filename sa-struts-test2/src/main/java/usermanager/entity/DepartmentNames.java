package usermanager.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Department}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "Aug 27, 2013 10:50:04 AM")
public class DepartmentNames {

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
    public static class _DepartmentNames extends PropertyName<Department> {

        /**
         * インスタンスを構築します。
         */
        public _DepartmentNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _DepartmentNames(final String name) {
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
        public _DepartmentNames(final PropertyName<?> parent, final String name) {
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
         * versionのプロパティ名を返します。
         *
         * @return versionのプロパティ名
         */
        public PropertyName<Integer> version() {
            return new PropertyName<Integer>(this, "version");
        }
    }
}