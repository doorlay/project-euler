puts "Hello, World!"
# I'm going to see if I can figure out how Ruby works. Who knows, maybe I'll really like it
# and make it my go-to language, over Python.


class Song
    def initialize(name, artist, duration)
        @name = name
        @artist = artist
        @duration = duration
    end
end


aSong = Song.new("Harvest Moon","Neil Young",300)
puts aSong.inspect