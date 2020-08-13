package org.apoorv.ap.cs2020practice;

public class DownloadInfo {
    /** Creates a new instance with the given unique title and sets the
     * number of times downloaded to 1.
     * @param title the unique title of the downloaded song
     */
    private int downloads;
    private String songTitle;
    public DownloadInfo(String title) {
        this.songTitle = title;
        this.downloads = 0;
    }
    /** @return the title */
    public String getTitle()
    { /* implementation not shown */ }
    /** Increment the number times downloaded by 1 */
    public void incrementTimesDownloaded()
    { /* implementation not shown */ }
    // There may be instance variables, constructors, and methods that are not shown.
}
