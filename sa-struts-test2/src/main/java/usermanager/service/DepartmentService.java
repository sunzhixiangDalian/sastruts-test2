package usermanager.service;

import java.util.List;
import javax.annotation.Generated;
import usermanager.entity.Department;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static usermanager.entity.DepartmentNames.*;

/**
 * {@link Department}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "Aug 26, 2013 10:46:10 AM")
public class DepartmentService extends AbstractService<Department> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Department findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子とバージョン番号でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @param version
     *            バージョン番号
     * @return エンティティ
     */
    public Department findByIdVersion(Integer id, Integer version) {
        return select().id(id).version(version).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Department> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}