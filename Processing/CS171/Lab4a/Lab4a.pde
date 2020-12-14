import java.io.StringWriter;
void setup()
{
 size(150,150);

 double [][] Aline12={{1,1,1}, // Create a 2D array to store A
 {1,2,3},{1,5,-3}};

 Matrix A = new Matrix(Aline12); // Copy array to A Matrix data structure

 double [][] B1ine12 = {{9}, // Create a 2D array to store B
 {23},{-7}};

 Matrix B = new Matrix(B1ine12); // Copy array to B Matrix data structure

 Matrix X=(A.inverse()).times(B); // Solve for X
text("A",10,12);
 app_print(A,0,16);

 text("B",110,12);
 app_print(B,100,16);

 text("X",10,65);
 app_print(X,0,70);
}
// Method added to allow printing on applet screen at (x,y)
void app_print(Matrix P, int x, int y)
{
 StringWriter stringWriter = new StringWriter();
 PrintWriter writer = new PrintWriter(stringWriter);
 P.print(writer,5,2);
 text(stringWriter.toString(),x,y);
}

 //X.print(5,2); // Print(column width, decimal places) on console
