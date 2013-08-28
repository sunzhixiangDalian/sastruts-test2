package usermanager.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link User}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "Aug 27, 2013 10:50:04 AM")
public class UserNames {

    /**
     * UIdのプロパティ名を返します。
     * 
     * @return UIdのプロパティ名
     */
    public static PropertyName<Integer> UId() {
        return new PropertyName<Integer>("UId");
    }

    /**
     * UNameのプロパティ名を返します。
     * 
     * @return UNameのプロパティ名
     */
    public static PropertyName<String> UName() {
        return new PropertyName<String>("UName");
    }

    /**
     * UAgeのプロパティ名を返します。
     * 
     * @return UAgeのプロパティ名
     */
    public static PropertyName<Integer> UAge() {
        return new PropertyName<Integer>("UAge");
    }

    /**
     * USexのプロパティ名を返します。
     * 
     * @return USexのプロパティ名
     */
    public static PropertyName<Integer> USex() {
        return new PropertyName<Integer>("USex");
    }

    /**
     * UAddrのプロパティ名を返します。
     * 
     * @return UAddrのプロパティ名
     */
    public static PropertyName<String> UAddr() {
        return new PropertyName<String>("UAddr");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _UserNames extends PropertyName<User> {

        /**
         * インスタンスを構築します。
         */
        public _UserNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _UserNames(final String name) {
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
        public _UserNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * UIdのプロパティ名を返します。
         *
         * @return UIdのプロパティ名
         */
        public PropertyName<Integer> UId() {
            return new PropertyName<Integer>(this, "UId");
        }

        /**
         * UNameのプロパティ名を返します。
         *
         * @return UNameのプロパティ名
         */
        public PropertyName<String> UName() {
            return new PropertyName<String>(this, "UName");
        }

        /**
         * UAgeのプロパティ名を返します。
         *
         * @return UAgeのプロパティ名
         */
        public PropertyName<Integer> UAge() {
            return new PropertyName<Integer>(this, "UAge");
        }

        /**
         * USexのプロパティ名を返します。
         *
         * @return USexのプロパティ名
         */
        public PropertyName<Integer> USex() {
            return new PropertyName<Integer>(this, "USex");
        }

        /**
         * UAddrのプロパティ名を返します。
         *
         * @return UAddrのプロパティ名
         */
        public PropertyName<String> UAddr() {
            return new PropertyName<String>(this, "UAddr");
        }
    }
}