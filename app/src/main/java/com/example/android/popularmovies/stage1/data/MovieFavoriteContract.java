package com.example.android.popularmovies.stage1.data;

import android.provider.BaseColumns;

/**
 * Created by User on 22.10.2016..
 */

public class MovieFavoriteContract {


    private MovieFavoriteContract() {

    }

    public static class Entry implements BaseColumns {
        /**
         * Table name where records are stored for "entry" resources.
         */
        public static final String TABLE_NAME = "entry";
        /**
         * Article title
         */
        public static final String COLUMN_NAME_ORIGINAL_TITLE = "original_title";
        /**
         * Article hyperlink. Corresponds to the rel="alternate" link in the
         * Atom spec.
         */
        public static final String COLUMN_NAME_IMAGE = "image";
        /**
         * Date article was published.
         */
        public static final String COLUMN_NAME_RELEASE_DATE = "release_date";

        public static final String COLUMN_NAME_OVERVIEW = "overview";

        public static final String COLUMN_NAME_VOTE_AVERAGE = "average";

        public static final String COLUMN_NAME_MOVIE_ID = "movie_id";
    }

    public static class MovieTrailers implements BaseColumns {
        /**
         * Table name where records are stored for "entry" resources.
         */
        public static final String TABLE_NAME = "movieTrailers";

        public static final String COLUMN_NAME_MOVIE_ENTRY = "movie_entry";

        public static final String COLUMN_NAME_VIDEO_LINK = "video_link";

        public static final String COLUMN_NAME_TRAILER_NAME = "trailer_name";
    }
}


