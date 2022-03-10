import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination"

function Listing() {
    return (
        <>
            <Pagination />
            <div className="row">
                <div className="col">
                <MovieCard />
                </div>
                <div className="col">
                <MovieCard />
                </div>
                <div className="col">
                <MovieCard />
                </div>
                <div className="col">
                <MovieCard />
                </div>
                <div className="col">
                <MovieCard />
                </div>
                <div className="col">
                <MovieCard />
                </div>
            </div>
            
        </>
    );
}

export default Listing;