package com.example.android.offerprototype;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by asha on 28-03-2017.
 */

import android.content.Context;
        import android.support.v4.view.PagerAdapter;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.TextView;

import static android.R.attr.label;

/**
 * Created by rizvan on 12/13/16.
 */

public class VerticalViewPagerAdapter extends PagerAdapter {

//    String mResources[] = {"Spider-Man is a fictional superhero appearing in American comic books published by Marvel Comics. The character was created by writer-editor Stan Lee and writer-artist Steve Ditko, and first appeared in the anthology comic book Amazing Fantasy #15 (Aug. 1962) in the Silver Age of Comic Books. Lee and Ditko conceived the character as an orphan being raised by his Aunt May and Uncle Ben, and as a teenager, having to deal with the normal struggles of adolescence in addition to those of a costumed crime-fighter. Spider-Man's creators gave him super strength and agility, the ability to cling to most surfaces, shoot spider-webs using wrist-mounted devices of his own invention, which he calls \"web-shooters\", and react to danger quickly with his \"spider-sense\", enabling him to combat his foes.",
//            "Iron Man is a 2008 American superhero film based on the Marvel Comics character of the same name, produced by Marvel Studios and distributed by Paramount Pictures.1 It is the first film in the Marvel Cinematic Universe. The film was directed by Jon Favreau, with a screenplay by Mark Fergus & Hawk Ostby and Art Marcum & Matt Holloway. It stars Robert Downey Jr., Terrence Howard, Jeff Bridges, Shaun Toub and Gwyneth Paltrow. In Iron Man, Tony Stark, an industrialist and master engineer, builds a powered exoskeleton and becomes the technologically advanced superhero Iron Man.\n" +
//                    "\n"};

    Context mContext;
    LayoutInflater mLayoutInflater;

    public VerticalViewPagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //The Changes begin from here..
    @Override
    public int getCount() {
        return 12;
    }

    //I do not know what is isViewFromObject
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.content_main2, container, false);

        TextView tTitle = (TextView) itemView.findViewById(R.id.title);
        TextView tDueDate = (TextView) itemView.findViewById(R.id.due_date);
        TextView tAddress = (TextView) itemView.findViewById(R.id.address);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.offer_pic);



        if(position%4==0) {
            tTitle.setText(R.string.title1);
            tDueDate.setText(R.string.dueDate1);
            tAddress.setText(R.string.detail);
            imageView.setImageResource(R.drawable.fashion1);
        }else if(position%4==1){
            tTitle.setText(R.string.title1);
            tDueDate.setText(R.string.dueDate1);
            tAddress.setText(R.string.detail);
            imageView.setImageResource(R.drawable.image_search_1489686086143);
        }else if(position%4==2){
            tTitle.setText(R.string.title1);
            tDueDate.setText(R.string.dueDate1);
            tAddress.setText(R.string.detail);
            imageView.setImageResource(R.drawable.image_search_1489686107285);
        }else if(position%4==3){
            tTitle.setText(R.string.title1);
            tDueDate.setText(R.string.dueDate1);
            tAddress.setText(R.string.detail);
            imageView.setImageResource(R.drawable.image_search_1489686140224);
        }







        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}

