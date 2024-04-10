public class Main 
{
    var gridSize = 15;
    var squareSize;
    var colored = false; 
    
    function setup() 
    {
      createCanvas(400, 400);
    
      squareSize = width / gridSize;
    
      background(0);
    }
    
    function draw() 
    {
      stroke(0);
    
      for (var i = 0; i < gridSize; i++) 
      {
        for (var j = 0; j < gridSize; j++) 
        {
          
          var x = i * squareSize;
          var y = j * squareSize;
    
          noFill();
          rect(x, y, squareSize, squareSize);
        }
      }
    
      if (!colored) 
      {
        setColor(6 * squareSize, 1 * squareSize, color(198, 114, 81));
        setColor(7 * squareSize, 1 * squareSize, color(198, 114, 81));
        setColor(8 * squareSize, 1 * squareSize, color(157, 76, 46));
        setColor(5 * squareSize, 2 * squareSize, color(215, 228, 244));
        setColor(6 * squareSize, 2 * squareSize, color(199, 176, 166));
        setColor(7 * squareSize, 2 * squareSize, color(199, 176, 166));
        setColor(8 * squareSize, 2 * squareSize, color(199, 176, 166));
        setColor(9 * squareSize, 2 * squareSize, color(184, 206, 232));
        setColor(5 * squareSize, 3 * squareSize, color(184, 206, 232));
        setColor(6 * squareSize, 3 * squareSize, color(157, 76, 46));
        setColor(7 * squareSize, 3 * squareSize, color(157, 76, 46));
        setColor(8 * squareSize, 3 * squareSize, color(139, 61, 33));
        setColor(9 * squareSize, 3 * squareSize, color(184, 206, 232));
        setColor(6 * squareSize, 4 * squareSize, color(184, 206, 232));
        setColor(7 * squareSize, 4 * squareSize, color(182, 80, 128));
        setColor(8 * squareSize, 4 * squareSize, color(104, 141, 189));
        setColor(6 * squareSize, 5 * squareSize, color(184, 206, 232));
        setColor(7 * squareSize, 5 * squareSize, color(158, 55, 120));
        setColor(8 * squareSize, 5 * squareSize, color(104, 141, 189));
        setColor(5 * squareSize, 6 * squareSize, color(215, 228, 244));
        setColor(6 * squareSize, 6 * squareSize, color(158, 55, 120));
        setColor(7 * squareSize, 6 * squareSize, color(158, 55, 120));
        setColor(8 * squareSize, 6 * squareSize, color(158, 55, 120));
        setColor(9 * squareSize, 6 * squareSize, color(104, 141, 189));
        setColor(4 * squareSize, 7 * squareSize, color(215, 228, 244));
        setColor(5 * squareSize, 7 * squareSize, color(193, 121, 161));
        setColor(6 * squareSize, 7 * squareSize, color(184, 206, 232));
        setColor(7 * squareSize, 7 * squareSize, color(193, 121, 161));
        setColor(8 * squareSize, 7 * squareSize, color(158, 55, 120));
        setColor(9 * squareSize, 7 * squareSize, color(182, 80, 128));
        setColor(10 * squareSize, 7 * squareSize, color(104, 141, 189));
        setColor(3 * squareSize, 8 * squareSize, color(215, 228, 244));
        setColor(4 * squareSize, 8 * squareSize, color(193, 121, 161));
        setColor(5 * squareSize, 8 * squareSize, color(184, 206, 232));
        setColor(6 * squareSize, 8 * squareSize, color(182, 80, 128));
        setColor(7 * squareSize, 8 * squareSize, color(212, 159, 194));
        setColor(8 * squareSize, 8 * squareSize, color(212, 159, 194));
        setColor(9 * squareSize, 8 * squareSize, color(233, 211, 228));
        setColor(10 * squareSize, 8 * squareSize, color(193, 121, 161));
        setColor(11 * squareSize, 8 * squareSize, color(104, 141, 189));
        setColor(3 * squareSize, 9 * squareSize, color(215, 228, 244));
        setColor(4 * squareSize, 9 * squareSize, color(193, 121, 161));
        setColor(5 * squareSize, 9 * squareSize, color(184, 206, 232));
        setColor(6 * squareSize, 9 * squareSize, color(212, 159, 194));
        setColor(7 * squareSize, 9 * squareSize, color(233, 211, 228));
        setColor(8 * squareSize, 9 * squareSize, color(233, 211, 228));
        setColor(9 * squareSize, 9 * squareSize, color(233, 211, 228));
        setColor(10 * squareSize, 9 * squareSize, color(233, 211, 228));
        setColor(11 * squareSize, 9 * squareSize, color(104, 141, 189));
        setColor(3 * squareSize, 10 * squareSize, color(184, 206, 232));
        setColor(4 * squareSize, 10 * squareSize, color(193, 121, 161));
        setColor(5 * squareSize, 10 * squareSize, color(212, 159, 194));
        setColor(6 * squareSize, 10 * squareSize, color(233, 211, 228));
        setColor(7 * squareSize, 10 * squareSize, color(233, 211, 228));
        setColor(8 * squareSize, 10 * squareSize, color(243, 234, 237));
        setColor(9 * squareSize, 10 * squareSize, color(233, 211, 228));
        setColor(10 * squareSize, 10 * squareSize, color(233, 211, 228));
        setColor(11 * squareSize, 10 * squareSize, color(104, 141, 189));
        setColor(3 * squareSize, 11 * squareSize, color(104, 141, 189));
        setColor(4 * squareSize, 11 * squareSize, color(212, 159, 194));
        setColor(5 * squareSize, 11 * squareSize, color(233, 211, 228));
        setColor(6 * squareSize, 11 * squareSize, color(233, 211, 228));
        setColor(7 * squareSize, 11 * squareSize, color(243, 234, 237));
        setColor(8 * squareSize, 11 * squareSize, color(243, 234, 237));
        setColor(9 * squareSize, 11 * squareSize, color(243, 234, 237));
        setColor(10 * squareSize, 11 * squareSize, color(212, 159, 194));
        setColor(11 * squareSize, 11 * squareSize, color(104, 141, 189));
        setColor(4 * squareSize, 12 * squareSize, color(104, 141, 189));
        setColor(5 * squareSize, 12 * squareSize, color(212, 159, 194));
        setColor(6 * squareSize, 12 * squareSize, color(243, 234, 237));
        setColor(7 * squareSize, 12 * squareSize, color(243, 234, 237));
        setColor(8 * squareSize, 12 * squareSize, color(243, 234, 237));
        setColor(9 * squareSize, 12 * squareSize, color(212, 159, 194));
        setColor(10 * squareSize, 12 * squareSize, color(104, 141, 189));
        setColor(5 * squareSize, 13 * squareSize, color(104, 141, 189));
        setColor(6 * squareSize, 13 * squareSize, color(104, 141, 189));
        setColor(7 * squareSize, 13 * squareSize, color(104, 141, 189));
        setColor(8 * squareSize, 13 * squareSize, color(104, 141, 189));
        setColor(9 * squareSize, 13 * squareSize, color(104, 141, 189));
        
        colored = true; 
        
      }
      
    }
    
    
    function setColor(x, y, col) 
    {
      var i = floor(x / squareSize);
      var j = floor(y / squareSize);
    
      if (i >= 0 && i < gridSize && j >= 0 && j < gridSize) 
      {
        
        var posX = i * squareSize;
        var posY = j * squareSize;
    
        fill(col);
        
        rect(posX, posY, squareSize, squareSize);
      }
    }
     
}
