package reports;

import com.umg.api.model.Proveedor;
import java.io.InputStream;
import java.util.List;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class ProveedorReport {
     public static void generarReporte(List<Proveedor> proveedores) throws Exception {

        String ruta = "ruta";

        JasperReport reporte =
                JasperCompileManager.compileReport(ruta);

        JRBeanCollectionDataSource dataSource =
                new JRBeanCollectionDataSource(proveedores);

        JasperPrint impresion =
                JasperFillManager.fillReport(
                        reporte,
                        null,
                        dataSource
                );

        JasperViewer.viewReport(impresion, false);
    }
}
