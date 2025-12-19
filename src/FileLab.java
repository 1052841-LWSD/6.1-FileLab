import java.io.*;

public class FileLab {
    public static boolean fileExists(File f){
        //TODO: implement fileExists
        //Returns true if the given file exists on the file system, false if not

        return false;
    }

    public static boolean fileIsReadable(File f){
        //TODO: implement fileIsReadable
        //Returns true if the given file exists and is readable, false if not

        return false;
    }

    public static long fileSize(File f){
        //TODO: implement fileSize
        //Returns the size of the given file
        //Return -1 if it doesn't exist

        return 0;
    }

    public static String fileName(File f){
        //TODO: implement fileName
        //Returns the name of the file (not path)
        //Should work whether file exists or not

        return "";
    }

    public static boolean deleteFile(File f){
        //TODO: implement deleteFile
        //Attempt to delete the given file from the file system
        //Return true if deletion succeeded, false if not
        return false;
    }

    public static boolean renameFile(File source, File target){
        //TODO: implement renameFile
        //Attempt to rename the source file to the target file name or path
        //Return true if rename succeeded, false otherwise

        return false;
    }
}
