package spcx.sandbox.enableautoconfigdemo;

import org.junit.jupiter.api.Test;

/**
 * When <code>spring-boot-starter-jdbc</code> is added to the classpath
 * and no jdbc resource is configured, the application fails to load.
 * However, we can tell spring boot to avoid autoconfiguring the
 * datasource using the {@link org.springframework.boot.autoconfigure.EnableAutoConfiguration}
 * annotation in which autoconfigure classes can be excluded.
 *
 * <p>However, that annotation fails to do its job if placed on a parent
 * class, although is annotated with the {@link java.lang.annotation.Inherited}</p>
 * meta annotation.
 *
 * @author alexandru.ionita@sepiat.com
 */
public class ChildTest extends EnableAutoConfigDemoApplicationTests
{
    @Test
    void contextLoads()
    {
    }
}
