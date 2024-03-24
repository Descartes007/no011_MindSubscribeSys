package utils.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @instruction
 * 读取连接池配置
 */
public class PoolProperties {
	public static Properties properties = new Properties();
	
	static {
		InputStream in = PoolProperties.class.getClassLoader().getResourceAsStream("pool.properties");
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
