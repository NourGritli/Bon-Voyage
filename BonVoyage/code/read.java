import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class read
{
    static BufferedReader In;
    
    static {
        read.In = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public static void FlushInput() throws IOException {
        read.In.readLine();
    }
    
    public static char GetChar() throws IOException {
        return (char)read.In.read();
    }
    
    public static double GetDouble() throws IOException {
        try {
            return new Double(read.In.readLine().trim());
        }
        catch (NumberFormatException ex) {
            return new Double(read.In.readLine().trim());
        }
    }
    
    public static float GetFloat() throws IOException {
        try {
            return new Float(read.In.readLine().trim());
        }
        catch (NumberFormatException ex) {
            return new Float(read.In.readLine().trim());
        }
    }
    
    public static int GetInt() throws IOException {
        try {
            return new Integer(read.In.readLine().trim());
        }
        catch (NumberFormatException ex) {
            return new Integer(read.In.readLine().trim());
        }
    }
    
    public static long GetLong() throws IOException {
        try {
            return new Long(read.In.readLine().trim());
        }
        catch (NumberFormatException ex) {
            return new Long(read.In.readLine().trim());
        }
    }
    
    public static String GetString() throws IOException {
        return read.In.readLine().trim();
    }
}
