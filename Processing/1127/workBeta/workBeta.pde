import grafica.*;
GPlot plot1; 
Table table;
void setup() 
{
size(540,350);
table = loadTable("IrishPop.csv", "csv"); 
GPointsArray points = new GPointsArray(table.getRowCount());
for (TableRow row : table.rows())   { 
float year = row.getFloat(0); // (0) refers to the first column (year)
float population = row.getFloat(1)/1000000; // (1) is second column (population) millions 
points.add(year,population); // Add new point to the list 
}  
plot1 = new GPlot(this);      // Create an instance of the Gplot class called plot1 
plot1.setPos(25, 25);         // Set the plot1 position in window to 25,25  
plot1.setDim(350, 200);       // Set plot size to 350x200   
plot1.setMar(60, 70, 40, 70); // Set margins (bottom,left,top,right)    
plot1.setPointSize(5);        // Sets diameter of points on screen  
plot1.setTitleText("Population change in Ireland");   
plot1.getXAxis().setAxisLabelText("Year");  
plot1.getYAxis().setAxisLabelText("Population (x1 million)");  
plot1.setYLim(2.5, 5);        // Sets upper and lower bound of Y-axis  
plot1.setPoints(points);      // Link the point array with the plot 
plot1.defaultDraw();          // Draw the graph
}
