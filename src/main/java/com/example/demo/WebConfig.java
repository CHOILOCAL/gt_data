package com.example.demo; // 여러분의 실제 패키지명으로 변경해주세요.

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // /api/로 시작하는 모든 경로에 CORS 적용
                // 💡 여기에 'http://localhost:5173'을 정확히 입력해야 합니다.
                // 만약 프런트엔드가 다른 포트에서 실행된다면 해당 포트로 변경해야 합니다.
                .allowedOrigins("http://localhost:5173")
                // 개발 중에는 임시로 모든 Origin을 허용하는 '*'를 사용할 수도 있습니다.
                // .allowedOrigins("*") // ⚠️ 주의: 실제 배포 시에는 특정 Origin을 명시해야 보안상 안전합니다.
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 허용할 HTTP 메서드 (OPTIONS는 Pre-flight 요청을 위해
                                                                           // 필수)
                .allowedHeaders("*") // 모든 헤더 허용 (Content-Type, Authorization 등 포함)
                .allowCredentials(true) // 자격 증명 (쿠키, HTTP 인증, Authorization 헤더) 허용
                .maxAge(3600); // Pre-flight 요청 결과 캐싱 시간 (초 단위)
    }
}
