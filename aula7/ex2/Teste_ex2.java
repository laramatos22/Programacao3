package aula7.ex2;

import java.io.*;

public class Teste_ex2 {
	
	public static void main(String[] args) {
		
		try( RandomAccessFile imageFile = new RandomAccessFile("Figura.bmp", "r") ) {

			// ler os headers
		    Bitmap.bitmapFileHeader = new BitmapFileHeader(imageFile);
		    Bitmap.bitmapInfoHeader = new BitmapInfoHeader(imageFile);
		    
		    // imprimir a informação bmp
		    System.out.println(Bitmap.bitmapFileHeader + "\n");
		    System.out.println(Bitmap.bitmapInfoHeader + "\n");

		    
		    
		    // Obter a imagem da pixel data
		    byte[] pixelData = new byte[((Bitmap.bitmapInfoHeader.width+3)*Bitmap.bitmapInfoHeader.height)*3]; 
		    int imageSize = 0;
		    try {
		    		imageSize = imageFile.read(pixelData);
	    		}
			catch (EOFException ex) {
		    		System.out.println("Figura.bmp foi lido com sucesso.");
		    } 
			finally {
				Bitmap.data = new byte[imageSize];
				System.arraycopy(pixelData, 0, Bitmap.data, 0, imageSize);
			}
		    
			
			
		    // Salvar a informação de pixaeis para .raw
		    try( RandomAccessFile rawFile = new RandomAccessFile("image.raw", "rw") ) {
    				rawFile.write(Bitmap.data);
		    		System.out.println("image.raw foi criado com sucesso.");
		    }
		    catch (Exception e) {
		    		e.printStackTrace();
		    }
		    
		    

		    // Criar um bmp mais pequeno (x0.25)
			
		    try( RandomAccessFile smallImg = new RandomAccessFile("smallerImage.bmp", "rw") ) {

		    		BitmapUtils.createSmaller(smallImg);
		    		
	    			System.out.println("smallerImage.bmp foi criado com sucesso.");
		    }
		    catch (Exception e) {
		    		e.printStackTrace();
		    }

		    
		    // Criar um fliped
		    try( RandomAccessFile flippedImg = new RandomAccessFile("flippedImage.bmp", "rw") ) {
		    	
		    		BitmapUtils.createFlip(flippedImg);
		    		
	    			System.out.println("flippedImage.bmp foi criado com sucesso.");
		    }
		    catch (Exception e) {
		    		e.printStackTrace();
		    }
		    
		    
		    // criar um horizontal
		    try( RandomAccessFile flippedImg = new RandomAccessFile("horizontalFlipImage.bmp", "rw") ) {
		    	
		    		BitmapUtils.createHorizontalFlip(flippedImg);
		    		
	    			System.out.println("horizontalFlipImage.bmp foi criado com sucesso.");
		    }
		    catch (Exception e) {
		    		e.printStackTrace();
		    }
		    
		    
		    // criar um vertical
		    try( RandomAccessFile flippedImg = new RandomAccessFile("verticalFlipImage.bmp", "rw") ) {
		    	
		    		BitmapUtils.createVerticalFlip(flippedImg);
		    		
	    			System.out.println("verticalFlipImage.bmp foi criado com sucesso.");
		    }
		    catch (Exception e) {
		    		e.printStackTrace();
		    }
		    
		    
		    
		    // criar uma copia do bmp 
		    try( RandomAccessFile copyImg = new RandomAccessFile("imageCopy.bmp", "rw") ) {
		    	
		    		BitmapUtils.createCopy(copyImg);
		    		
	    			System.out.println("imageCopy.bmp foi criado com sucesso.");
		    }
		    catch (Exception e) {
		    		e.printStackTrace();
		    }
		    
		} catch(Exception e) {
			System.err.println(e);
		}

		System.out.println("Done!");
	}

}