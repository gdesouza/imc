package imc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LeDadosCsv {

  private File file;
  private List<String[]> infoList = new ArrayList<String[]>();
  private boolean isFileReady = false;

  public LeDadosCsv(File file) {
    setFile(file);
  }

  public LeDadosCsv(String fullName) {
    setFile( new File(fullName) );
  }

  public void readFile(){
    try{
      InputStream is = new FileInputStream(getFile());
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);
      String s = "";
      int i = 0;
      while((s = br.readLine()) != null){
        //Ignora primeira linha
        if(i!=0)
          setInfoList(s.split(";"));
        i++;
      }
      br.close();
      this.isFileReady = true;
    }catch(Exception e){
      e.printStackTrace();
    }
  }

  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public void setInfoList(String[] listaInfos) {
    this.infoList.add(listaInfos);
  }

  public List<String[]> getInfoList(){
    return this.infoList;
  }

  public String getAtArrayIndex(String[] array, int index) throws IndexOutOfBoundsException{
    return array[index];
  }

  public Integer GetSize() {
    return this.infoList.size();
  }

}
