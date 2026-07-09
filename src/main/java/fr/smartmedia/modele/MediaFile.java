package fr.smartmedia.modele;

public abstract class MediaFile {

    private String originalPath;
    private String targetPath;
    private EnumerationEtat status;

    public MediaFile(String originalPath) {
        this.originalPath = originalPath;
        this.status = EnumerationEtat.EN_ATTENTE;
    }
}