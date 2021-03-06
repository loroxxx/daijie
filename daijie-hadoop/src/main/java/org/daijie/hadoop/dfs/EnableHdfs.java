package org.daijie.hadoop.dfs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

/**
 * hadoop dfs启用注解
 * @author daijie_jay
 * @since 2018年4月25日
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({
	HdfsAutoConfigure.class,
	HdfsUtil.class
})
public @interface EnableHdfs {

}
