package admin.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.security.crypto.EncryptionUtil;
import admin.security.jwt.JWTUtil;

@Service
public class AdminService {

    @Autowired
    private AdminDAO dao;

    @Autowired
    private JWTUtil jwt;

    public String login(AdminDTO dto) {
        dto.setPassword(EncryptionUtil.encrypt(dto.getPassword()));
        int result = dao.login(dto);
        String token = jwt.createToken(dto.getAdmin_id());
        return result > 0 ? token : null;
    }
}
