public class Enemy4 extends GameObject
{
  private int m_ticks = 0;
  private java.util.Random m_rand = new java.util.Random();
  
  public Enemy4()
  {
	 super("./Devil5.png", 10, 10, 50, 50, 5, 5);
  }	
  public Enemy4(int x, int y, int w, int h, int dX, int dY)
  {
    super("./Devil5.png", x, y, w, h, dX, dY);
  }

  @Override
  public void tick(int maxw, int maxh)
  {
	m_ticks++;
	if (m_ticks % 10 == 0)
	{
	   m_x = m_rand.nextInt(maxw);
	   m_y = m_rand.nextInt(maxh);
	}	  
    m_x = m_x + m_dX;
    m_y = m_y + m_dY;
    
    if (m_x > maxw)
      m_x = 0;
    else if (m_x < 0)
      m_x = maxw;

    if (m_y > maxh)
      m_y = 0;
    else if (m_y < 0)
      m_y = maxh;

  }

}
