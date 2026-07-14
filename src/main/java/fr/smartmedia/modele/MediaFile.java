package fr.smartmedia.modele;

public abstract class MediaFile {


    private String originalPath;
    private String targetPath;
    private EnumerationEtat status;

    public MediaFile(String originalPath) {
        this.originalPath = originalPath;
        this.status = EnumerationEtat.EN_ATTENTE;
    }

    public String getOriginalPath() {
        return this.originalPath;
    }

    public String getTargetPath() {
        return this.targetPath;
    }

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    public EnumerationEtat getStatus() {
        return status;
    }

    public void setStatus(EnumerationEtat status) {
        this.status = status;
    }

    //renvoie le texte qui ce situe apres le . d'un fichier
    public String getExtension() {
        int indexOfDot = this.originalPath.lastIndexOf('.');

        if (indexOfDot == -1 || indexOfDot == this.originalPath.length() - 1) {
            return "";
        }

        return this.originalPath.substring(indexOfDot + 1);
    }

}