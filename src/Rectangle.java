public class Rectangle{

 private double width;
 private double heigth;
     
  public  Rectangle()
  {
    heigth=1;
    width=1;
  }

  public Rectangle(double width,double heigth)
  {
      this.heigth=heigth;
      this.width=width;
  }

  public double GetArea()
  {
      return heigth*width;
  }

  public double GetPerimeter()
  {
      return 2*(width+heigth);
  }

  public double GetWidth()
  {
      return width;
  }


}