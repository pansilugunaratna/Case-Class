object CaseClass extends App{
    val p1 = Point(1,0) ;
    val p2 = Point(4,5) ;

    println() ;

    println("p1: "+p1) ;
    println("p2: "+p2) ;

    println() ;

    // add p1 and p2
    print("p1 + p2 = ") ;
    print(p1+p2) ;

    println() ;

    // move a point by dx length (length via x axis) and dy length (length via y axis)
    print("Move p1 by (2,10) : ") ;
    print(p1.move(2,10)) ;

    println("\n") ;

    // return distance between point1 and point2
    val p3 = Point(5,8) ;
    val p4 = Point(7,12) ;
    val distance =(p1:Point,p2:Point) => Point(p1.x-p2.x, p1.y-p2.y);
   
    println("p3: "+p3) ;
    println("p4: "+p4) ;
    println() ;
    print("Distance between p3 and p4 : ");
    print(distance(p3,p4)) ;

    println() ;

    //switch x and y coordinates
    print("Switch coordinates " + p2 +" : ") ;
    print(p2.invert()) ;

    println() ;
}

case class Point(x:Int, y:Int){

    def +(that:Point) = Point (this.x + that.x, this.y + that.y) ;
    def move(dx:Int, dy:Int) = Point (this.x + dx, this.y + dy) ;
    // def distance(valx:Int, valy:Int) = Point (this.x - valx, this.y - valy) ;
    // def distance(this:Point, that:Point) = Point()
    def invert() = Point(this.y, this.x) ;

    override def toString = "(" + x + "," + y + ")" ;
}