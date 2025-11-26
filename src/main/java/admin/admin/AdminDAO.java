package admin.admin;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDAO {
    @Autowired
    private SqlSession mybatis;

    public int login(AdminDTO dto){
        return mybatis.selectOne("admin.login", dto);
    }
}
