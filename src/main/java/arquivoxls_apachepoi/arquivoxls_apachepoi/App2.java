package arquivoxls_apachepoi.arquivoxls_apachepoi;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import apachepoi.classes.Funcionario;

public class App2 {
	
	public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\leand\\Documents\\projetosJava\\arquivoxls-apachepoi\\arquivo2.xls");
        if(!file.exists()) {
        	file.createNewFile();
        }
        
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Lucas");
        funcionario1.setIdade(25);
        funcionario1.setTelefone("179999-5555");
        
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Ana Carolina");
        funcionario2.setIdade(24);
        funcionario2.setTelefone("179999-6666");
        
        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Daniel");
        funcionario3.setIdade(20);
        funcionario3.setTelefone("179999-8888");
        
        List<Funcionario>funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        
        HSSFWorkbook hssfWorkBook = new HSSFWorkbook();//cria a planilha
        HSSFSheet escreveLinha = hssfWorkBook.createSheet();
        
        int numeroLinha = 0;
        
        for (Funcionario perFuncionario : funcionarios) {
			
        	Row linha = escreveLinha.createRow(numeroLinha++); //cria linha
        	
        	int celula = 0;
        	
        	Cell cellNome = linha.createCell(celula++); //cria celula na linha
        	cellNome.setCellValue(perFuncionario.getNome());
        	
        	Cell cellTelefone = linha.createCell(celula++); //cria celula na linha
        	cellTelefone.setCellValue(perFuncionario.getTelefone());
        	
        	Cell cellIdade = linha.createCell(celula++); //cria celula na linha
        	cellIdade.setCellValue(Integer.valueOf(perFuncionario.getIdade()));
		}
        
        FileOutputStream saida = new FileOutputStream(file);
        hssfWorkBook.write(saida);
        saida.flush();
        saida.close();
        System.out.println("Gerado com Sucesso!");
	}
	
	

}
