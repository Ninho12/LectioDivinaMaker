module edu.codigodasantidade.lectiodivina.nucleo.lectiodivina {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.codigodasantidade.lectiodivina.nucleo.lectiodivina to javafx.fxml;
    exports edu.codigodasantidade.lectiodivina.nucleo.lectiodivina;
}