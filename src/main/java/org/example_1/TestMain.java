package org.example_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext_1.xml"
        );
        //Music musicBean = context.getBean("musicBean", Music.class);
        // manual dependency injection
        //MusicPlayer musicPlayer = new MusicPlayer(musicBean);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // non-manual DI - by the XML configuration
        musicPlayer.playMusic();
        System.out.println("Name: " + musicPlayer.getName());
        System.out.println("Volume: " + musicPlayer.getVolume());
        context.close();
    }
}
