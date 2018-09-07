package vn.com.knowledge.config;

import org.apache.catalina.Context;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatReactiveWebServerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author LocLD1
 *
 */
//@Configuration
public class TomcatReactiveWebServerConfig /*extends TomcatReactiveWebServerFactory */{

    /*@Value("${server.context-path}")
    private String contextPath;

    @Override
    protected void configureContext(final Context context) {
        super.configureContext(context);
        if (StringUtils.isNotBlank(this.contextPath)) {
            context.setPath(this.contextPath);
        }
    }*/
}