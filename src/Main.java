import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date objDate=new Date();
        

        Estudiante alan= new Estudiante("alan","mora", "pinto","9216721",12/08/22,"villa vicencia",67444602,1515156156,"george54019411@gmail.com");
        Docente javier= new Docente("sander","lastra","gonzales","5151551","","calle olivos",4515151,51551515, "albertino24@gmail.com");
        Persona [] personas= {alan,javier};
        Usuario [] usuarios={alan, javier};
         Persona persona1= alan;
        Persona persona2= javier;
        Usuario usuario1= alan;
        Usuario usuario2=javier;
        Estudiante estudiante1= (Estudiante)persona1;
        Estudiante estudiante2= (Estudiante)persona2;

    }
}