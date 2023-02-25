static int mdia=0;  
public static int diameter(Node node)
{
   int fht=0;int sht=0;
    
    for(Node child:node.children)
    {
        int nht=diameter(child);
        if(nht>fht)
        {
            sht=fht;
            fht=nht;
        }
        else if(nht>sht)
        {
            sht=nht;
        }
    }
    if(fht+sht>mdia)
    {
        mdia=fht+sht;
    }
    return (fht+1);
    
}
