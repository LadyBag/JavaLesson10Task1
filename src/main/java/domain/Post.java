package domain;

import java.util.Date;

public class Post {
    private int id;
    private User owner; //owner_id
    private User author; // from_id
    private User admin; // created_by
    private User replyOwner; //reply_owner_id
    private Post replyPost; //reply_post_id
    private boolean friendsOnly; // friend_only
    private String text; //text
    private Date date; //date

    private CommentInfo commentInfo;
    private Copyright copyright;
    private LikeInfo likeInfo;

    private RepostInfo repostInfo;
    private int viewCount;

    private String postType;

    private Object PostSource;
    private Geo geo;

    private User signer;

    private boolean canPin;

    private boolean canDelete;
    private boolean canEdit;
    private boolean isFavorite;
    private boolean markedAds;

}
