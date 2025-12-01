package admin.report;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReportDAO {
    @Autowired
    private SqlSession mybatis;

    public List<ReportDTO> boardList() {
        return mybatis.selectList("report.boardList");
    }
}
