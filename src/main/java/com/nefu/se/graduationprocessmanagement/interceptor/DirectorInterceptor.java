package com.nefu.se.graduationprocessmanagement.interceptor;

import com.nefu.se.graduationprocessmanagement.component.EncryptionComponent;
import com.nefu.se.graduationprocessmanagement.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component
@Slf4j
public class DirectorInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private EncryptionComponent encryptionComponent;

//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String header = request.getHeader("authorization");
//        try {
//            Map<String, Object> map = encryptionComponent.decrypt(header);
//            Integer roleId = (Integer) map.get("rId");
//            if (roleId == 4) {
//                return true;
//            } else {
//                request.setAttribute("exception", ResultVO.NotPermit());
//                request.getRequestDispatcher("/api/exception").forward(request, response);
//                return false;
//            }
//        } catch (Exception e) {
//            request.setAttribute("exception", ResultVO.NotPermit());
//            request.getRequestDispatcher("/api/exception").forward(request, response);
//            return false;
//        }
//
//    }
}
