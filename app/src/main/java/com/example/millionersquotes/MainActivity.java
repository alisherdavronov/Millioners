package com.example.millionersquotes;


import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    String[] names = {
            "Bill Gates",
            "Mark Zuckerberg",
            "Mark Kuban",
            "Alisher Usmanov",
            "Oprah Winfrey",
            "Steve Jobs",
            "Jack Ma",
            "Andrew Carnigie",
            "Donald Trump",
            "Jeff Bezos",
            "Henry Ford",
            "Eike Batista",
            "Warren Buffett",
            "J.Paul Getty",
            "Sheldon Adelson",
            "Lakshmi Mittal",
            "Michael Bloomberg",
            "Chuck Feeney",
            "Ingvar Kamprad",
            "Aristotle Onassis",
            "Nick Woodman",
            "Tyler Perry",
            "Li-Ka Shing",
            "Mukesh Ambani",
            "Michael Dell",
            "Bernald Arnault",
            "Sheldon Adelson",
    };

    String[] stories = {
            "Bill Gates and his partner Paul Allen built the world's largest software business, Microsoft. He became one of the richest men in the world and a major philanthropist through the Bill & Melinda Gates Foundation. You most unhappy customers are you greatest source of learning. Success is a lousy teacher. it seduces smart people into thinking they can't lose.As we look ahead into the next century, leaders will be those who empower others. ",
            "Mark Zuckerberg is co-founder and CEO of the social-networking website Facebook, as well as one of the world's youngest billionaires. The biggest risk is not taking any risk... In a world that changing really quickly, the only strategy that is guaranteed to fail is not taking risks.",
            "Mark Kuban is Co-founder of the successful startup Broadcast.com, Mark Cuban is known as the zealous owner of the NBA's Dallas Mavericks and a star of the TV show 'Shark Tank. Sweat equity is the most valuable equity there is. Know your business and industry better than anyone else in the world. Love what you do or don't do it.",
            "Alisher Burkhanovich Usmanov is a business mogul who was the richest person in Russia in 2011 with an estimated wealth of $18.1 billion USD. He acquired this wealth from several successful investments, lumber operations and mining. I have been very fortunate to be successful in business, and I believe that it is right that people who have this type of wealth should give something back into society",
            "Oprah Winfrey (1954 – ) Influential talk show host, author, philanthropist, actress and media personality. Oprah Winfrey has played a key role in modern American life, shaping cultural trends and promoting various liberal causes. Through her talk shows and books, she has focused on many issues facing American women. She has been an important role model for black American women, breaking down many invisible barriers. Be thankful for what you have; you'll end up having more. If you concentrate on what you don't have, you will never, ever have enough.",
            "Steve Jobs co-founded Apple Computers with Steve Wozniak. Under Jobs' guidance, the company pioneered a series of revolutionary technologies, including the iPhone and iPad. Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle. As with all matters of the heart, you'll know when you find it. Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma - which is living with the results of other people's thinking. Don't let the noise of others' opinions drown out your own inner voice. And most important, have the courage to follow your heart and intuition. You can't connect the dots looking forward; you can only connect them looking backwards. So you have to trust that the dots will somehow connect in your future. You have to trust in something - your gut, destiny, life, karma, whatever. This approach has never let me down, and it has made all the difference in my life.",
            "Jack Ma or Ma Yun (Chinese: 马云; born September 10, 1964)[2] is a Chinese business magnate and philanthropist. He is the founder and executive chairman of Alibaba Group, a family of successful Internet-based businesses. He is the first mainland Chinese entrepreneur to appear on the cover of Forbes.[3] As of November 2014 The lessons I learned from the dark days at Alibaba are that you've got to make your team have value, innovation, and vision. Also, if you don't give up, you still have a chance. And, when you are small, you have to be very focused and rely on your brain, not your strength.",
            "Andrew Carnegie, a self-made steel tycoon and one of the wealthiest 19th century U.S. businessmen, donated towards the expansion of the New York Public Library. People who are unable to motivate themselves must be content with mediocrity, no matter how impressive their other talents.",
            "Republican presidential nominee hopeful Donald Trump is a billionaire real estate mogul and television personality. I try to learn from the past, but I plan for the future by focusing exclusively on the present. That's were the fun is.",
            "American entrepreneur Jeff Bezos is the founder and chief executive officer of Amazon.com. In 2013, he purchased The Washington Post. A brand for a company is like a reputation for a person. You earn reputation by trying to do hard things well.",
            "One of America's foremost industrialists, Henry Ford revolutionized assembly-line modes of production for the automobile. Coming together is a beginning, staying together is progress, and working together is success.",
            "Eike Batista,  (born Nov. 3, 1956, Governador Valadares, Braz.), Brazilian business magnate who made a fortune in mining and oil and gas exploration.I was educated to think maybe Brazil works, maybe it doesn't. But I decided I am going to make this country work for my children. I am investing all my effort now in making Brazil a great country.",
            "Known as the \"Oracle of Omaha,\" Warren Buffett is an investment guru and one of the richest and most respected businessmen in the world. It takes 20 years to build a reputation and five minutes to ruin it. If you think about that, you'll do things differently.",
            "Billionaire businessman J.Paul Getty became president of the Getty Oil Company after the death of his father, George Getty. His Getty Foundation funds the J. Paul Getty Museum and other artist endeavors.",
            "Sheldon Adelson developed COMDEX, a computer trade show, which made him a fortune and launched him into the casino resort business. If I were to retire, I would keep my family's interest in the company the same and say, Don't sell",
            "Lakshmi Niwas Mittal (born 15 June 1950) is an Indian steel magnate, based in the United Kingdom. He is the chairman and CEO of ArcelorMittal, the world’s largest steelmaking company. Mittal owns 38% of ArcelorMittal and holds a 34% stake in Queens Park Rangers F.C..This is a learning in the business life that first of all you need to have commitment, dedication and passion for what you are doing.",
            "Michael Bloomberg is a billionaire buisnessman and a three-term mayor of New York City. We cannot continue. Our pension costs and health care costs for our employees are going to bankrupt this city.",
            "Charles Francis \"Chuck\" Feeney (born April 23, 1931)[1] is an Irish-American businessman and philanthropist and the founder of The Atlantic Philanthropies, one of the largest private foundations in the world. He made his fortune as a co-founder, with Robert Warren Miller, of the Duty Free Shoppers Group. I had one idea that never changed in my mind - that you should use your wealth to help people",
            "Ingvar Feodor Kamprad was born on 30 March 1926, on a small farm called Elmtaryd near the village of Agunnaryd, in the Swedish province of Småland. To most present-day Swedes, the date and the names, in a famously rural region, resound of harsher times, when Sweden was agrarian and poor. They speak of hard work, frugality and egalitarianism rooted in shared poverty – values which would eventually enter the IKEA ethos. We ought to have more women in various management positions, because women are the ones who decide almost everything in the home.",
            "Aristotle Onassis is best known as the Greek shipping tycoon who married JFK's widow, Jacqueline Kennedy, in 1968.It is during our darkest moments that we must focus to see the light.",
            "Nicholas D. \"Nick\" Woodman (born June 24, 1975) is an American businessman, and the founder and CEO of GoPro You know what the best thing about morning ski trips are? McDonald's!",
            "Writer, actor, producer, and director Tyler Perry has built an entertainment empire that consists of successful films, plays, and a best-selling book.It's not an easy journey, to get to a place where you forgive people. But it is such a powerful place, because it frees you ",
            "Sir Ka-shing Li, GBM, KBE, JP (born 29 July 1928 in Chaozhou, China) he is a Hong Kong business magnate, investor, and philanthropist. According to the Bloomberg Billionaires Index, as of 16 April 2014 he is the richest person in Asia, with a net worth of $31.9 billion. He is the chairman of the board of CK Hutchison Holdings as of 2015; through it, he is the world's largest operator of container terminals and the world's largest health and beauty retailer. Something that seems to be a loss can often turn out to be a gain. ",
            "Mukesh Dhirubhai Ambani (born 19 April 1957) is an Indian business magnate who is the chairman, managing director and largest shareholder of Reliance Industries Limited (RIL), a Fortune Global 500 company and India's second most valuable company by market value. All of us, in a sense, struggle continuously all the time, because we never get what we want. The important thing which I've really learned is how do you not give up, because you never succeed in the first attempt.",
            "Michael Dell helped launch the personal computer revolution in the 1980s with the creation of the Dell Computer Corporation, now known as Dell Inc.People ask me all the time, 'How can I become a successful entrepreneur?' And I have to be honest: It's one of my least favorite questions, because if you're waiting for someone else's advice to become an entrepreneur, chances are you're not one.",
            "Bernard Jean Étienne Arnault (French: [bɛʁnaːʁ aʁno]; born 5 March 1949) is a French business magnate, investor. philanthropist and art collector.[4][5] He is the chairman and Chief Executive Officer of LVMH since 1989. In March 2015, Forbes estimated his wealth to be $37 billion, making him the 13th richest person in the world and the richest in FranceWhen I was working in my first job engineering construction, what I liked the most was working with architects and making buildings that had this creative side coming from the architect and that were making them a big success.",
            "Sheldon Adelson developed COMDEX, a computer trade show, which made him a fortune and launched him into the casino resort business",
    };

    String[] imageNames = {
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
            "mark",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);
        // peoplename = new String[4];
        //Resources res = getResources();
        //peoplename = res.getStringArray(R.array.billioners)) {
        setListAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_expandable_list_item_1,
                names
        ));
    }

    protected void onListItemClick(ListView lv, View v, int position, long id) {
        super.onListItemClick(lv, v, position, id);

        String name = names[position];
        String story = stories[position];
        String imageName = imageNames[position];

        new AlertDialog.Builder(this)
                .setTitle("Item Selected")
                .setMessage("Selected Item " + name)
                .setNeutralButton("OK", null)
                .show();

        Intent i = new Intent(MainActivity.this, Quotes.class);

        i.putExtra("name", name);
        i.putExtra("story", story);
        i.putExtra("imageName", imageName);

        startActivity(i);
    }
}


