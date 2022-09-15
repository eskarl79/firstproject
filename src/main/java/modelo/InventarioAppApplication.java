package modelo;

import controlador.ControladorProducto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import vista.window_IApp;



@SpringBootApplication
public class InventarioAppApplication {
        @Autowired
        RepositorioProducto rep;
        
	public static void main(String[] args) {
	  //SpringApplication.run(InventarioAppApplication.class, args);
                                SpringApplicationBuilder builder = new SpringApplicationBuilder(InventarioAppApplication.class);
                                builder.headless(false);
                                ConfigurableApplicationContext context = builder.run(args);
	}
        
                      @Bean
                       ApplicationRunner applicationRunner(){
                                 return args -> {
                                            final Log logger = LogFactory.getLog(getClass());
                                           window_IApp m = new window_IApp();
                                            m.setVisible(true);
                                            ControladorProducto controlador = new ControladorProducto(rep, m);
                                            m.setControlador(controlador);
                                            controlador.setListaProductos(controlador.obtenerProductos());
                                            controlador.inicializaTabla();
                                                        
            };
        }
}
