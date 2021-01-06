package domain;

import java.util.Date;

public class Post {
    private int id;
    private String name;
    private String description;
    private String author;
    private String contentURL;
    private Date data;
    private int likeCount;
    private int repostCount;
    private int viewCount;
    private boolean isRepost;
    private CommentInfo commentInfo;
}
