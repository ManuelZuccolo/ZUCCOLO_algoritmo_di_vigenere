public class AlgoritmoVigenere
{
    public char Algoritmo(char lettera, int chiave, char metodo)
    {
        if(metodo == '+')
        {
            int ascii = lettera;
            ascii += chiave;
            char character = (char) ascii;
            return character;
        }
        if(metodo == '-')
        {
            int ascii = lettera;
            ascii -= chiave;
            char character = (char) ascii;
            return character;
        }
        return ' ';
    }
}
